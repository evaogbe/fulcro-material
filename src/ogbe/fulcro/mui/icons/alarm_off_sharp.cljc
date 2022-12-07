(ns ogbe.fulcro.mui.icons.alarm-off-sharp
  #?(:cljs (:require
            ["@mui/icons-material/AlarmOffSharp" :default AlarmOffSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-alarm-off-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AlarmOffSharp)))