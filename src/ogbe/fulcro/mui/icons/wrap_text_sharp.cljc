(ns ogbe.fulcro.mui.icons.wrap-text-sharp
  #?(:cljs (:require
            ["@mui/icons-material/WrapTextSharp" :default WrapTextSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-wrap-text-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WrapTextSharp)))