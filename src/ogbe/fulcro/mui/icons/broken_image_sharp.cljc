(ns ogbe.fulcro.mui.icons.broken-image-sharp
  #?(:cljs (:require
            ["@mui/icons-material/BrokenImageSharp" :default BrokenImageSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-broken-image-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BrokenImageSharp)))