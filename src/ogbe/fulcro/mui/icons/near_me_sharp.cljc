(ns ogbe.fulcro.mui.icons.near-me-sharp
  #?(:cljs (:require
            ["@mui/icons-material/NearMeSharp" :default NearMeSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-near-me-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NearMeSharp)))