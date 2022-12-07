(ns ogbe.fulcro.mui.icons.copy-all-rounded
  #?(:cljs (:require
            ["@mui/icons-material/CopyAllRounded" :default CopyAllRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-copy-all-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CopyAllRounded)))