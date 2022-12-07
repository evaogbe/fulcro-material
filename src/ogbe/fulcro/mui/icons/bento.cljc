(ns ogbe.fulcro.mui.icons.bento
  #?(:cljs (:require
            ["@mui/icons-material/Bento" :default Bento]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-bento
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Bento)))