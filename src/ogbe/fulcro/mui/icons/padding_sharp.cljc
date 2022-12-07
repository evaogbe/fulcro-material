(ns ogbe.fulcro.mui.icons.padding-sharp
  #?(:cljs (:require
            ["@mui/icons-material/PaddingSharp" :default PaddingSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-padding-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PaddingSharp)))