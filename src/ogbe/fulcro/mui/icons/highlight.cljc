(ns ogbe.fulcro.mui.icons.highlight
  #?(:cljs (:require
            ["@mui/icons-material/Highlight" :default Highlight]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-highlight
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Highlight)))