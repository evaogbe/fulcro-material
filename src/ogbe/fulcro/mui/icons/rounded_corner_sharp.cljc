(ns ogbe.fulcro.mui.icons.rounded-corner-sharp
  #?(:cljs (:require
            ["@mui/icons-material/RoundedCornerSharp" :default RoundedCornerSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-rounded-corner-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RoundedCornerSharp)))