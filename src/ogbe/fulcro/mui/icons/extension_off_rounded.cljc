(ns ogbe.fulcro.mui.icons.extension-off-rounded
  #?(:cljs (:require
            ["@mui/icons-material/ExtensionOffRounded" :default ExtensionOffRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-extension-off-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ExtensionOffRounded)))