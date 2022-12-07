(ns ogbe.fulcro.mui.icons.alarm-off
  #?(:cljs (:require
            ["@mui/icons-material/AlarmOff" :default AlarmOff]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-alarm-off
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AlarmOff)))