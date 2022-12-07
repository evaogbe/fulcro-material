(ns ogbe.fulcro.mui.icons.hive
  #?(:cljs (:require
            ["@mui/icons-material/Hive" :default Hive]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-hive
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Hive)))