(ns ogbe.fulcro.mui.icons.hive-sharp
  #?(:cljs (:require
            ["@mui/icons-material/HiveSharp" :default HiveSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-hive-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HiveSharp)))