(ns ogbe.fulcro.mui.icons.schema-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/SchemaTwoTone" :default SchemaTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-schema-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SchemaTwoTone)))