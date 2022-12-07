(ns ogbe.fulcro.mui.icons.colorize
  #?(:cljs (:require
            ["@mui/icons-material/Colorize" :default Colorize]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-colorize
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Colorize)))