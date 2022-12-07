(ns ogbe.fulcro.mui.icons.contrast-sharp
  #?(:cljs (:require
            ["@mui/icons-material/ContrastSharp" :default ContrastSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-contrast-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ContrastSharp)))