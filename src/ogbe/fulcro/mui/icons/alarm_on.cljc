(ns ogbe.fulcro.mui.icons.alarm-on
  #?(:cljs (:require
            ["@mui/icons-material/AlarmOn" :default AlarmOn]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-alarm-on
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AlarmOn)))