(ns ogbe.fulcro.mui.icons.public-sharp
  #?(:cljs (:require
            ["@mui/icons-material/PublicSharp" :default PublicSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-public-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PublicSharp)))