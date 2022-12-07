(ns ogbe.fulcro.mui.icons.sick-sharp
  #?(:cljs (:require
            ["@mui/icons-material/SickSharp" :default SickSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sick-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SickSharp)))