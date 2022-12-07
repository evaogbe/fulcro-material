(ns ogbe.fulcro.mui.icons.expand-more-sharp
  #?(:cljs (:require
            ["@mui/icons-material/ExpandMoreSharp" :default ExpandMoreSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-expand-more-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ExpandMoreSharp)))