(ns ogbe.fulcro.mui.icons.adb-sharp
  #?(:cljs (:require
            ["@mui/icons-material/AdbSharp" :default AdbSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-adb-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AdbSharp)))