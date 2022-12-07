(ns ogbe.fulcro.mui.icons.facebook-sharp
  #?(:cljs (:require
            ["@mui/icons-material/FacebookSharp" :default FacebookSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-facebook-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FacebookSharp)))