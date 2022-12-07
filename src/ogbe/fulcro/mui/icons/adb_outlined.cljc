(ns ogbe.fulcro.mui.icons.adb-outlined
  #?(:cljs (:require
            ["@mui/icons-material/AdbOutlined" :default AdbOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-adb-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AdbOutlined)))