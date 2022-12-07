(ns ogbe.fulcro.mui.icons.alarm-add-sharp
  #?(:cljs (:require
            ["@mui/icons-material/AlarmAddSharp" :default AlarmAddSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-alarm-add-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AlarmAddSharp)))