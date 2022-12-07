(ns ogbe.fulcro.mui.icons.alarm-on-sharp
  #?(:cljs (:require
            ["@mui/icons-material/AlarmOnSharp" :default AlarmOnSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-alarm-on-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AlarmOnSharp)))