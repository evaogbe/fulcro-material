(ns ogbe.fulcro.mui.icons.woman-sharp
  #?(:cljs (:require
            ["@mui/icons-material/WomanSharp" :default WomanSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-woman-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WomanSharp)))