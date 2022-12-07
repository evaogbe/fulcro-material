(ns ogbe.fulcro.mui.icons.alarm-add
  #?(:cljs (:require
            ["@mui/icons-material/AlarmAdd" :default AlarmAdd]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-alarm-add
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AlarmAdd)))