(ns ogbe.fulcro.mui.icons.schedule
  #?(:cljs (:require
            ["@mui/icons-material/Schedule" :default Schedule]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-schedule
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Schedule)))