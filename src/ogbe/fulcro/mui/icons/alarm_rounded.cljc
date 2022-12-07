(ns ogbe.fulcro.mui.icons.alarm-rounded
  #?(:cljs (:require
            ["@mui/icons-material/AlarmRounded" :default AlarmRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-alarm-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AlarmRounded)))