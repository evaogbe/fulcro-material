(ns ogbe.fulcro.mui.icons.description-sharp
  #?(:cljs (:require
            ["@mui/icons-material/DescriptionSharp" :default DescriptionSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-description-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DescriptionSharp)))