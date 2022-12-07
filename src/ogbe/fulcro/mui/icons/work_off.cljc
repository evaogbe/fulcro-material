(ns ogbe.fulcro.mui.icons.work-off
  #?(:cljs (:require
            ["@mui/icons-material/WorkOff" :default WorkOff]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-work-off
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WorkOff)))