(ns ogbe.fulcro.mui.icons.toc-sharp
  #?(:cljs (:require
            ["@mui/icons-material/TocSharp" :default TocSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-toc-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TocSharp)))