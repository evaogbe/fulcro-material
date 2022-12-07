(ns ogbe.fulcro.mui.icons.alarm
  #?(:cljs (:require
            ["@mui/icons-material/Alarm" :default Alarm]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-alarm
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Alarm)))