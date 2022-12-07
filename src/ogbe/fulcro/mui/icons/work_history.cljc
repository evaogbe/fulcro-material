(ns ogbe.fulcro.mui.icons.work-history
  #?(:cljs (:require
            ["@mui/icons-material/WorkHistory" :default WorkHistory]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-work-history
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WorkHistory)))