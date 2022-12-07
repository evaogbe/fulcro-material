(ns ogbe.fulcro.mui.icons.key-sharp
  #?(:cljs (:require
            ["@mui/icons-material/KeySharp" :default KeySharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-key-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory KeySharp)))