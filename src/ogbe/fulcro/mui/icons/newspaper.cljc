(ns ogbe.fulcro.mui.icons.newspaper
  #?(:cljs (:require
            ["@mui/icons-material/Newspaper" :default Newspaper]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-newspaper
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Newspaper)))