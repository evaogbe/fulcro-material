(ns ogbe.fulcro.mui.icons.dry-sharp
  #?(:cljs (:require
            ["@mui/icons-material/DrySharp" :default DrySharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-dry-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DrySharp)))