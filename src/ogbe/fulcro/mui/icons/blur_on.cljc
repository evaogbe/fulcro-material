(ns ogbe.fulcro.mui.icons.blur-on
  #?(:cljs (:require
            ["@mui/icons-material/BlurOn" :default BlurOn]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-blur-on
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BlurOn)))