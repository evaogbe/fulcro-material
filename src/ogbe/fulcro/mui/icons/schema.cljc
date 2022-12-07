(ns ogbe.fulcro.mui.icons.schema
  #?(:cljs (:require
            ["@mui/icons-material/Schema" :default Schema]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-schema
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Schema)))