(ns ogbe.fulcro.mui.icons.iso-sharp
  #?(:cljs (:require
            ["@mui/icons-material/IsoSharp" :default IsoSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-iso-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory IsoSharp)))