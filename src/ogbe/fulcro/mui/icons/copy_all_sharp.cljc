(ns ogbe.fulcro.mui.icons.copy-all-sharp
  #?(:cljs (:require
            ["@mui/icons-material/CopyAllSharp" :default CopyAllSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-copy-all-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CopyAllSharp)))