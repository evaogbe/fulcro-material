(ns ogbe.fulcro.mui.icons.alarm-on-rounded
  #?(:cljs (:require
            ["@mui/icons-material/AlarmOnRounded" :default AlarmOnRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-alarm-on-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AlarmOnRounded)))