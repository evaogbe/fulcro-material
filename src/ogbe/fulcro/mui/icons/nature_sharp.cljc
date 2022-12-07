(ns ogbe.fulcro.mui.icons.nature-sharp
  #?(:cljs (:require
            ["@mui/icons-material/NatureSharp" :default NatureSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-nature-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NatureSharp)))