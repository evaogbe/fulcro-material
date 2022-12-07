(ns ogbe.fulcro.mui.icons.foundation-sharp
  #?(:cljs (:require
            ["@mui/icons-material/FoundationSharp" :default FoundationSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-foundation-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FoundationSharp)))