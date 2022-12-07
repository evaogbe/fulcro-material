(ns ogbe.fulcro.mui.icons.copy-all
  #?(:cljs (:require
            ["@mui/icons-material/CopyAll" :default CopyAll]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-copy-all
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CopyAll)))