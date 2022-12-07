(ns ogbe.fulcro.mui.icons.alarm-sharp
  #?(:cljs (:require
            ["@mui/icons-material/AlarmSharp" :default AlarmSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-alarm-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AlarmSharp)))