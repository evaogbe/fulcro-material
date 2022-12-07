(ns ogbe.fulcro.mui.icons.toc
  #?(:cljs (:require
            ["@mui/icons-material/Toc" :default Toc]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-toc
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Toc)))