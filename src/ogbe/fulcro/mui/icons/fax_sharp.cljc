(ns ogbe.fulcro.mui.icons.fax-sharp
  #?(:cljs (:require
            ["@mui/icons-material/FaxSharp" :default FaxSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-fax-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FaxSharp)))