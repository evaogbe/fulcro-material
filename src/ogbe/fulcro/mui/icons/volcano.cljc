(ns ogbe.fulcro.mui.icons.volcano
  #?(:cljs (:require
            ["@mui/icons-material/Volcano" :default Volcano]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-volcano
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Volcano)))