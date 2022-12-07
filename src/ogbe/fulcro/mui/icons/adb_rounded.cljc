(ns ogbe.fulcro.mui.icons.adb-rounded
  #?(:cljs (:require
            ["@mui/icons-material/AdbRounded" :default AdbRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-adb-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AdbRounded)))