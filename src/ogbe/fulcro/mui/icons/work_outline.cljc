(ns ogbe.fulcro.mui.icons.work-outline
  #?(:cljs (:require
            ["@mui/icons-material/WorkOutline" :default WorkOutline]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-work-outline
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WorkOutline)))