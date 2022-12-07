(ns ogbe.fulcro.mui.icons.whatshot
  #?(:cljs (:require
            ["@mui/icons-material/Whatshot" :default Whatshot]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-whatshot
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Whatshot)))