(ns ogbe.fulcro.mui.icons.extension-rounded
  #?(:cljs (:require
            ["@mui/icons-material/ExtensionRounded" :default ExtensionRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-extension-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ExtensionRounded)))