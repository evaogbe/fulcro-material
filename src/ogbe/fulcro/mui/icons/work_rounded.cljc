(ns ogbe.fulcro.mui.icons.work-rounded
  #?(:cljs (:require
            ["@mui/icons-material/WorkRounded" :default WorkRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-work-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WorkRounded)))