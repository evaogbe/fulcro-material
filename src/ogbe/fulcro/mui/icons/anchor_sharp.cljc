(ns ogbe.fulcro.mui.icons.anchor-sharp
  #?(:cljs (:require
            ["@mui/icons-material/AnchorSharp" :default AnchorSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-anchor-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AnchorSharp)))